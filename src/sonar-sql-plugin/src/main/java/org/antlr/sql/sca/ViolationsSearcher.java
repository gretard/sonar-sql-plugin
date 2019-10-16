package org.antlr.sql.sca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.sql.sca.matchers.DefaultNodesMatcher;
import org.antlr.sql.sca.matchers.INodesMatcher;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class ViolationsSearcher {

	private INodesMatcher matcher = new DefaultNodesMatcher();

	public Map<RuleImplementation, List<IParsedNode>> search(FoundMatch match) {

		Map<RuleImplementation, List<IParsedNode>> founds = new HashMap<>();
		initMap(founds, match.rule.getRuleImplementation());
		visit(match.node, null, match.rule.getRuleImplementation(), founds);
		return founds;
	}

	private void visit(final IParsedNode item, final IParsedNode parent, final RuleImplementation rule,
			Map<RuleImplementation, List<IParsedNode>> matches) {

	   
		if (!matcher.matches(item, parent, rule)) {
		//    System.out.println("NOMATCH "+item.getText()+" "+item.getClassName()+" "+(parent != null ? parent.getText()+" "+parent.getClassName(): "[]")+" "+rule.getRuleViolationMessage());
			return;
		}else {
		  //  System.out.println("MATCH "+item.getText()+" "+item.getClassName()+" "+(parent != null ? parent.getText()+" "+parent.getClassName(): "[]")+" "+rule.getRuleViolationMessage());
		}
		List<IParsedNode> temp = matches.getOrDefault(rule, new ArrayList<>());
		temp.add(item);
		matches.put(rule, temp);

		if (!rule.getChildrenRules().getRuleImplementation().isEmpty()) {
			for (IParsedNode nodeToCheck : item.getChildren()) {
				for (RuleImplementation ruleToCheck : rule.getChildrenRules().getRuleImplementation()) {
					visit(nodeToCheck, item, ruleToCheck, matches);
				}
			}
		}

		if (!rule.getParentRules().getRuleImplementation().isEmpty()) {
			for (IParsedNode nodeToCheck : item.getParents()) {
				for (RuleImplementation ruleToCheck : rule.getParentRules().getRuleImplementation()) {
					visit(nodeToCheck, item, ruleToCheck, matches);
				}
			}
		}

		if (!rule.getSiblingsRules().getRuleImplementation().isEmpty()) {
			for (IParsedNode nodeToCheck : item.getSiblings()) {
				for (RuleImplementation ruleToCheck : rule.getSiblingsRules().getRuleImplementation()) {
					visit(nodeToCheck, item, ruleToCheck, matches);
				}
			}
		}

		if (!rule.getUsesRules().getRuleImplementation().isEmpty()) {
			for (IParsedNode nodeToCheck : item.getUses()) {
				for (RuleImplementation ruleToCheck : rule.getUsesRules().getRuleImplementation()) {
					visit(nodeToCheck, item, ruleToCheck, matches);
				}
			}
		}
	}

	private static void initMap(final Map<RuleImplementation, List<IParsedNode>> map, final RuleImplementation rule) {
		map.putIfAbsent(rule, new ArrayList<>());

		for (final RuleImplementation i : rule.getChildrenRules().getRuleImplementation()) {
			initMap(map, i);
		}
		for (final RuleImplementation i : rule.getParentRules().getRuleImplementation()) {
			initMap(map, i);
		}
		for (final RuleImplementation i : rule.getUsesRules().getRuleImplementation()) {
			initMap(map, i);
		}
		for (final RuleImplementation i : rule.getSiblingsRules().getRuleImplementation()) {
			initMap(map, i);
		}
	}
}
