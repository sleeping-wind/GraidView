package com.example.graidview;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {

	// Model
	private ArrayList<String> mtextList;
	private ArrayList<Integer> mImageList;
	private ArrayList<HashMap<String, Object>> mDataList;

	// view
	private GridView mGridView;
	// M adapter
	private SimpleAdapter mSimpleAdapter;

	private void initModel() {
		mtextList = new ArrayList<String>();
		mtextList.add("奔驰");
		mtextList.add("宝马");
		mtextList.add("大众");
		mtextList.add("法拉利");
		mtextList.add("兰博基尼");
		mtextList.add("玛莎拉蒂");
		mtextList.add("保时捷");
		mtextList.add("劳斯莱斯");
		mtextList.add("五菱宏光");

		mImageList = new ArrayList<Integer>();
		mImageList.add(R.drawable.benz);
		mImageList.add(R.drawable.bmw);
		mImageList.add(R.drawable.dazhong);
		mImageList.add(R.drawable.falali);
		mImageList.add(R.drawable.lambo);
		mImageList.add(R.drawable.maserati);
		mImageList.add(R.drawable.porsche);
		mImageList.add(R.drawable.rolls);
		mImageList.add(R.drawable.wl);
		//
		mDataList = new ArrayList<HashMap<String, Object>>();
		for (int i = 0; i < mtextList.size(); i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("img", mImageList.get(i));
			map.put("txt", mtextList.get(i));

			mDataList.add(map);
		}
	}

	private void intiAdaptr() {
		String[] keys = new String[] { "img", "txt" };
		int[] ids = new int[] { R.id.item_img, R.id.item_txt };
		mSimpleAdapter = new SimpleAdapter(MainActivity.this, mDataList,
				R.layout.item_layout, keys, ids);
	}

	private void initView() {
		mGridView = (GridView) findViewById(R.id.grid);
		mGridView.setAdapter(mSimpleAdapter);
		mGridView.setOnItemClickListener(new OnItemClickListener() {
			// 参数一：点击的Item所在的容器控件对象
			// 参数二：单个Item布局的最外层的布局/控件
			// 参数三：点击的item的序号（重要）
			// 参数四：id，通常等同于参数三
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast.makeText(MainActivity.this, Integer.toString(position),
						Toast.LENGTH_SHORT).show();
			}
		});

		mGridView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 长按删除
				// 先删除数据源，再刷新页面（增加和修改数据同理）
				Toast.makeText(MainActivity.this,
						"已删除" + mDataList.get(position).get("txt").toString(),
						Toast.LENGTH_SHORT).show();

				mDataList.remove(position); // 删除数据
				mSimpleAdapter.notifyDataSetChanged(); // 刷新页面
				// 建议最终项目如果要用长按，长按收藏
				return true; // 改了true就不会跟点击冲突了
			}
		});
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		initModel();
		intiAdaptr();
		initView();
	}
}
