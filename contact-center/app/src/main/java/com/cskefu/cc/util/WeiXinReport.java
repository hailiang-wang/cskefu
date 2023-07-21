/*
 * Copyright (C) 2023 Beijing Huaxia Chunsong Technology Co., Ltd. 
 * <https://www.chatopera.com>, Licensed under the Chunsong Public 
 * License, Version 1.0  (the "License"), https://docs.cskefu.com/licenses/v1.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Copyright (C) 2018- Jun. 2023 Chatopera Inc, <https://www.chatopera.com>,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2017 优客服-多渠道客服系统,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package com.cskefu.cc.util;

public class WeiXinReport {
	private String data ;
	private long subs ;
	private long unsubs;

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public long getSubs() {
		return subs;
	}
	public void setSubs(long subs) {
		this.subs = subs;
	}
	public long getUnsubs() {
		return unsubs;
	}
	public void setUnsubs(long unsubs) {
		this.unsubs = unsubs;
	}	
}
