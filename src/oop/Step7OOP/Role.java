package oop.Step7OOP;

public class Role {
    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;

    public Role(boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

    public boolean isViewAll() {
        return viewAll;
    }

    public boolean isEditAll() {
        return editAll;
    }

    public boolean isAddAll() {
        return addAll;
    }

    public boolean isDeleteAll() {
        return deleteAll;
    }
}
