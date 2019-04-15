package com.mumu.jsrecyclerview4;

import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @author : zlf
 * date    : 2019/4/15
 * github  : https://github.com/mamumu
 * blog    : https://www.jianshu.com/u/281e9668a5a6
 * 说明：自命名适配器，继承BaseSectionQuickAdapter<SectionTestEntity, BaseViewHolder>为固定写法，然后实现构造器和需要重写的方法
 * convertHead： 为头部赋值 本文中红色字体为头部，头部中一般是只有一项为 item.header，如若要在头部中增加内容需要固定内容
 * convert： 为子内容赋值，本文中蓝色背景为字内容，字内容可以多个赋值为item.t,是一个后台返回的列表
 */
public class TestAdapter extends BaseSectionQuickAdapter<SectionTestEntity, BaseViewHolder> {


    public TestAdapter(int layoutResId, int sectionHeadResId, List<SectionTestEntity> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, SectionTestEntity item) {
        helper.setText(R.id.test_item_title, item.header);
        helper.setVisible(R.id.more, item.isMore());
        helper.addOnClickListener(R.id.more);
    }

    @Override
    protected void convert(BaseViewHolder helper, SectionTestEntity item) {
        TestEntity.ResultBean.ListBean listBean = item.t;
        helper.setText(R.id.test_item_message, listBean.getMessage());

    }
}
