package leetcode;

import java.util.List;

public class NestedIntegerOrList implements NestedInteger {

    private Integer val;
    private List<NestedInteger> list;

    public NestedIntegerOrList(Integer val) {
        this.val = val;
    }

    public NestedIntegerOrList(List<NestedInteger> list) {
        this.list = list;
    }

    @Override
    public boolean isInteger() {
        return val != null;
    }

    @Override
    public Integer getInteger() {
        return val;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }
}
