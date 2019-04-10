package com.mumu.jsrecyclerview4;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class TestAdapter extends BaseSectionQuickAdapter<TestEntity.ResultBean, BaseViewHolder> {


    public TestAdapter(int layoutResId, int sectionHeadResId, List<TestEntity.ResultBean> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, TestEntity.ResultBean item) {
        helper.setText(R.id.test_item_title, item.getTitle());
    }

    @Override
    protected void convert(BaseViewHolder helper, TestEntity.ResultBean item) {
        TestEntity.ResultBean.ListBean listBean= item.t;
        helper.setText(R.id.test_item_message, listBean.getMessage());
    }
}
