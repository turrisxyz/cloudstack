// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
// Automatically generated by addcopyright.py at 01/29/2013
// Apache License, Version 2.0 (the "License"); you may not use this
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.baremetal.networkservice;

import java.util.List;

import com.cloud.baremetal.database.BaremetalPxeVO;
import com.cloud.deploy.DeployDestination;
import com.cloud.uservm.UserVm;
import com.cloud.utils.component.Adapter;
import com.cloud.vm.NicProfile;
import com.cloud.vm.ReservationContext;
import com.cloud.vm.VirtualMachineProfile;

public interface BaremetalPxeService extends Adapter {
	
    public boolean prepare(VirtualMachineProfile profile, NicProfile nic, DeployDestination dest, ReservationContext context);

    public boolean prepareCreateTemplate(Long pxeServerId, UserVm vm, String templateUrl);
    
    BaremetalPxeVO addPxeServer(AddBaremetalPxeCmd cmd);
	
    BaremetalPxeResponse getApiResponse(BaremetalPxeVO vo);
	
	List<BaremetalPxeResponse> listPxeServers(ListBaremetalPxePingServersCmd cmd);
	
	String getPxeServiceType();
	
	public static final String PXE_PARAM_TYPE = "type";
	public static final String PXE_PARAM_ZONE = "zone";
	public static final String PXE_PARAM_POD = "pod";
	public static final String PXE_PARAM_IP = "ip";
	public static final String PXE_PARAM_GUID = "guid";
	public static final String PXE_PARAM_TFTP_DIR = "tftpDir";
	public static final String PXE_PARAM_USERNAME = "username";
	public static final String PXE_PARAM_PASSWORD = "password";
	public static final String PXE_PARAM_PING_STORAGE_SERVER_IP = "pingStorageServerIp";
	public static final String PXE_PARAM_PING_ROOT_DIR = "pingDir";
	public static final String PXE_PARAM_PING_STORAGE_SERVER_USERNAME = "pingStorageServerUserName";
	public static final String PXE_PARAM_PING_STORAGE_SERVER_PASSWORD = "pingStorageServerPassword";
}
