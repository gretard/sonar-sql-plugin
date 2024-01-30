package org.sonar.plugins.sql.issues;

public class SqlIssue {
    @Override
    public String toString() {
        return "SqlIssue [line="
                + line
                + ", repo="
                + repo
                + ", fileName="
                + fileName
                + ", isAdhoc="
                + isAdhoc
                + ", description="
                + description
                + ", name="
                + name
                + ", message="
                + message
                + ", key="
                + key
                + ", severity="
                + severity
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
        result = prime * result + (isAdhoc ? 1231 : 1237);
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + line;
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((repo == null) ? 0 : repo.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
        return result;
    }

    public String getUniqueKey() {
        return this.repo + ":" + this.key;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        SqlIssue other = (SqlIssue) obj;
        if (description == null) {
            if (other.description != null) return false;
        } else if (!description.equals(other.description)) return false;
        if (fileName == null) {
            if (other.fileName != null) return false;
        } else if (!fileName.equals(other.fileName)) return false;
        if (isAdhoc != other.isAdhoc) return false;
        if (key == null) {
            if (other.key != null) return false;
        } else if (!key.equals(other.key)) return false;
        if (line != other.line) return false;
        if (message == null) {
            if (other.message != null) return false;
        } else if (!message.equals(other.message)) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (repo == null) {
            if (other.repo != null) return false;
        } else if (!repo.equals(other.repo)) return false;
        if (severity == null) {
            if (other.severity != null) return false;
        } else if (!severity.equals(other.severity)) return false;
        return true;
    }

    public int line;

    public String repo;
    public String fileName;
    public boolean isExternal = true;

    public boolean isExternal() {
        return isExternal;
    }

    public String getFileName() {
        return fileName;
    }

    public boolean isAdhoc;

    public String description;
    public String name;
    public String ruleType = "CODE_SMELL";
    public long debtRemediationEffort = 0;

    public long getDebtRemediationEffort() {
        return debtRemediationEffort;
    }

    public String getRuleType() {
        if (ruleType == null) {
            return "CODE_SMELL";
        }
        return ruleType;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String message;

    public int getLine() {
        return line;
    }

    public String getRepo() {
        return repo;
    }

    public boolean isAdhoc() {
        return isAdhoc;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

    public String getSeverity() {
        return severity;
    }

    public String key;

    public String severity;
}
