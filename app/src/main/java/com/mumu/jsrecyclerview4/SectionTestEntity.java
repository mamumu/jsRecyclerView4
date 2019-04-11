package com.mumu.jsrecyclerview4;

import com.chad.library.adapter.base.entity.SectionEntity;

public class SectionTestEntity extends SectionEntity<TestEntity.ResultBean.ListBean> {
    private boolean isMore=true;
    public SectionTestEntity(boolean isHeader, String header,boolean isMore) {
        super(isHeader, header);
        this.isMore = isMore;
    }

    public SectionTestEntity(TestEntity.ResultBean.ListBean listBean) {
        super(listBean);
    }

    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean more) {
        isMore = more;
    }
}
