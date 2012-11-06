/**
 * Copyright 2012 52�North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.android.data;

import android.support.v4.app.DialogFragment;

public class DatasourceDialogFragment extends DialogFragment {

//	static DatasourceDialogFragment newInstance(String id, String datasourceName, String description, boolean codebase, GridChangedCallback callback){
//		DatasourceDialogFragment df = new DatasourceDialogFragment();
//		Bundle args = new Bundle();
//		args.putString("id", id);
//		args.putString("name", datasourceName);
//		args.putString("description", description);
//		args.putBoolean("isCodebase", codebase);
//		args.putSerializable("callback", callback);
//		df.setArguments(args);
//		return df;
//	}
//	
//	@Override
//	public Dialog onCreateDialog(Bundle savedInstanceState) {
//		// get paramters
//		Bundle args = getArguments();
//		final String id 			= args.getString("id");
//		final String name 			= args.getString("name");
//		final String description 	= args.getString("description");
//		final boolean isCodebase 	= args.getBoolean("isCodebase");
//		final GridChangedCallback c = (GridChangedCallback) args.getSerializable("callback");
//		
//		// inflate layout
//		LayoutInflater inflater = getActivity().getLayoutInflater();
//		View v = inflater.inflate(R.layout.cb_dialog_fragment, null);
//
//		TextView textView = (TextView) v.findViewById(R.id.cb_dialog_textview);
//		textView.setText(description);
//		
//		ImageView imageView = (ImageView) v.findViewById(R.id.cb_dialog_image);
//		ImageLoader.getInstance().displayImage(id, imageView);
////		imageView.setImageBitmap();
//		
////		dialogButton.setAnimation(getActivity().findViewById(android.R.drawable.stat_sys_download));
//		Dialog dsDialog = new AlertDialog.Builder(getActivity())
//							.setTitle(name)
//							.setPositiveButton((!isCodebase) ? "Download" : "Start", new DialogInterface.OnClickListener() {
//								
//								@Override
//								public void onClick(DialogInterface dialog, int which) {
//									if(isCodebase){
//										DataSourceAdapter.startDataSource(id);
//									}
//									else{
//										c.setProgressUpdater();
//									}
//								}
//							})
//							.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//								
//								@Override
//								public void onClick(DialogInterface dialog, int which) {
//									// TODO Auto-generated method stub
//									
//								}
//							})
//							.setView(v)
//							.create();
//		
//		return dsDialog;
//	}
//	
}
