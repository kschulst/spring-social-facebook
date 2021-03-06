/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.api;

import org.springframework.social.ApiException;

/**
 * Exception indicating that an attempt was made to publish an OpenGraph action without specifying an application namespace.
 * @author habuma
 */
@SuppressWarnings("serial")
public class MissingNamespaceException extends ApiException {

	public MissingNamespaceException() {
		super("An application namespace is required to publish OpenGraph actions.");
	}
	
}
