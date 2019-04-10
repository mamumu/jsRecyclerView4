package com.mumu.jsrecyclerview4;

import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class TestAdapter extends BaseSectionQuickAdapter<SectionTestEntity, BaseViewHolder> {


    public TestAdapter(int layoutResId, int sectionHeadResId, List<SectionTestEntity> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, SectionTestEntity item) {
        helper.setText(R.id.test_item_title, item.header);

    }

    @Override
    protected void convert(BaseViewHolder helper, SectionTestEntity item) {
        TestEntity.ResultBean.ListBean listBean= item.t;
        helper.setText(R.id.test_item_message, listBean.getMessage());

    }
}
