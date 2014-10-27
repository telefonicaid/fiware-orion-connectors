/**
 * Copyright 2014 Telefonica Investigación y Desarrollo, S.A.U
 *
 * This file is part of fiware-connectors (FI-WARE project).
 *
 * fiware-connectors is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * fiware-connectors is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with fiware-connectors. If not, see
 * http://www.gnu.org/licenses/.
 *
 * For those usages not covered by the GNU Affero General Public License please contact with Francisco Romero
 * francisco.romerobueno@telefonica.com
 */

package es.tid.fiware.fiwareconnectors.cygnus.utils;

/**
 *
 * @author fermin
 */
public final class Constants {
    
    /**
     * Constructor. It is private since utility classes should not have a public or default constructor.
     */
    private Constants() {
    } // Constants

    // HTTP and Flume header names
    public static final String HEADER_SERVICE      = "fiware-service";
    public static final String HEADER_SERVICE_PATH = "fiware-servicepath";
    public static final String HEADER_CONTENT_TYPE = "content-type";
    public static final String HEADER_USER_AGENT   = "user-agent";
    public static final int SERVICE_HEADER_MAX_LEN = 32;
    public static final int SERVICE_PATH_HEADER_MAX_LEN = 32;
    
    // Only Flume header names
    public static final String HEADER_TRANSACTION_ID = "transactionId";
    public static final String HEADER_TTL = "ttl";

    // Common fields for sinks/backends
    public static final String RECV_TIME_TS = "recvTimeTs";
    public static final String RECV_TIME    = "recvTime";
    public static final String ENTITY_ID    = "entityId";
    public static final String DESTINATION  = "destination";
    public static final String ENTITY_TYPE  = "entityType";
    public static final String ATTR_NAME    = "attrName";
    public static final String ATTR_TYPE    = "attrType";
    public static final String ATTR_VALUE   = "attrValue";
    public static final String ATTR_MD      = "attrMd";

    // HTTP client factory
    public static final int MAX_CONNS = 500;
    public static final int MAX_CONNS_PER_ROUTE = 100;
    
    // MySQL
    public static final int MYSQL_DB_NAME_MAX_LEN = 64;
    public static final int MYSQL_TABLE_NAME_MAX_LEN = 64;
    
    // CKAN
    public static final int CKAN_PKG_MAX_LEN = 100;
    public static final int CKAN_RESOURCE_MAX_LEN = 100;
    
    // Others
    public static final String EMPTY_MD = "[]";

    // Configuration parameter names
    public static final String PARAM_DEFAULT_SERVICE = "default_service";
    public static final String PARAM_DEFAULT_SERVICE_PATH = "default_service_path";
    public static final String PARAM_NOTIFICATION_TARGET = "notification_target";
    public static final String PARAM_EVENTS_TTL = "events_ttl";

} // Constants
