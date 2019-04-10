package com.mumu.jsrecyclerview4;

import com.chad.library.adapter.base.entity.SectionEntity;

public class SectionTestEntity extends SectionEntity<TestEntity.ResultBean.ListBean> {
    public SectionTestEntity(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public SectionTestEntity(TestEntity.ResultBean.ListBean listBean) {
        super(listBean);
    }
}
