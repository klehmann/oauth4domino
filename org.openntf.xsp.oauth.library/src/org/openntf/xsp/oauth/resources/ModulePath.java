/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.xsp.oauth.resources;

import org.openntf.xsp.oauth.Activator;
import org.openntf.xsp.oauth.library.OAuthLibrary;
import com.ibm.xsp.resource.DojoModulePathResource;

public class ModulePath extends DojoModulePathResource {
	public final static String NAMESPACE = OAuthLibrary.LIBRARY_RESOURCE_NAMESPACE;

	public ModulePath() {
		super(NAMESPACE, "/.ibmxspres/." + NAMESPACE + "/" + Activator.getVersion());
	}
}
