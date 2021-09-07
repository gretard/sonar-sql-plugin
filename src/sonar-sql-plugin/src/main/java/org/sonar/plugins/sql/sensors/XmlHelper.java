package org.sonar.plugins.sql.sensors;

import java.util.function.Function;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class XmlHelper {
    public static final String readAttribute(Node node, String att) {
        return readAttribute(node, att, null);
    }

    public static final String readAttribute(Node node, String att, String defaultValue) {
        if (node == null) {
            return null;
        }
        Node attributeNode = node.getAttributes().getNamedItem(att);
        if (attributeNode == null) {
            return defaultValue;
        }
        return attributeNode.getTextContent();
    }

    public static final Node getNode(Node parent, String name) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (name.equalsIgnoreCase(child.getNodeName())) {
                return child;
            }
        }
        return null;
    }

    public static final String getNodeValue(Node parent, String name) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (name.equalsIgnoreCase(child.getNodeName())) {
                return child.getTextContent();
            }
        }
        return null;
    }

    public static final <T> T getNodeValue2(Node parent, String name, Function<String, T> func, T defaultValue) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (name.equalsIgnoreCase(child.getNodeName())) {
                try {
                    return func.apply(child.getTextContent());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return defaultValue;
    }

}
