package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy extends com.imooc.viewpagertest.module.search.BaseSearchModel
    implements RealmObjectProxy, com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface {

    static final class BaseSearchModelColumnInfo extends ColumnInfo {
        long ecodeColKey;
        long emsgColKey;
        long dataColKey;

        BaseSearchModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BaseSearchModel");
            this.ecodeColKey = addColumnDetails("ecode", "ecode", objectSchemaInfo);
            this.emsgColKey = addColumnDetails("emsg", "emsg", objectSchemaInfo);
            this.dataColKey = addColumnDetails("data", "data", objectSchemaInfo);
        }

        BaseSearchModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BaseSearchModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BaseSearchModelColumnInfo src = (BaseSearchModelColumnInfo) rawSrc;
            final BaseSearchModelColumnInfo dst = (BaseSearchModelColumnInfo) rawDst;
            dst.ecodeColKey = src.ecodeColKey;
            dst.emsgColKey = src.emsgColKey;
            dst.dataColKey = src.dataColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private BaseSearchModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.BaseSearchModel> proxyState;

    com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BaseSearchModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.BaseSearchModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ecode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ecodeColKey);
    }

    @Override
    public void realmSet$ecode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ecodeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.ecodeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ecodeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ecodeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$emsg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emsgColKey);
    }

    @Override
    public void realmSet$emsg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emsgColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.emsgColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emsgColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emsgColKey, value);
    }

    @Override
    public com.imooc.viewpagertest.module.search.SearchModel realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.dataColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.imooc.viewpagertest.module.search.SearchModel.class, proxyState.getRow$realm().getLink(columnInfo.dataColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$data(com.imooc.viewpagertest.module.search.SearchModel value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("data")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.dataColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.dataColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.dataColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.dataColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "BaseSearchModel", false, 3, 0);
        builder.addPersistedProperty(NO_ALIAS, "ecode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "emsg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "data", RealmFieldType.OBJECT, "SearchModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BaseSearchModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BaseSearchModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BaseSearchModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BaseSearchModel";
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.BaseSearchModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("data")) {
            excludeFields.add("data");
        }
        com.imooc.viewpagertest.module.search.BaseSearchModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.BaseSearchModel.class, true, excludeFields);

        final com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) obj;
        if (json.has("ecode")) {
            if (json.isNull("ecode")) {
                objProxy.realmSet$ecode(null);
            } else {
                objProxy.realmSet$ecode((String) json.getString("ecode"));
            }
        }
        if (json.has("emsg")) {
            if (json.isNull("emsg")) {
                objProxy.realmSet$emsg(null);
            } else {
                objProxy.realmSet$emsg((String) json.getString("emsg"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                com.imooc.viewpagertest.module.search.SearchModel dataObj = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("data"), update);
                objProxy.realmSet$data(dataObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.BaseSearchModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.BaseSearchModel obj = new com.imooc.viewpagertest.module.search.BaseSearchModel();
        final com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("ecode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ecode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ecode(null);
                }
            } else if (name.equals("emsg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$emsg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$emsg(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                } else {
                    com.imooc.viewpagertest.module.search.SearchModel dataObj = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$data(dataObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class), false, Collections.<String>emptyList());
        io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy obj = new io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel copyOrUpdate(Realm realm, BaseSearchModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.BaseSearchModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel copy(Realm realm, BaseSearchModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.BaseSearchModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedRealmObject;
        }

        com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface unmanagedSource = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.ecodeColKey, unmanagedSource.realmGet$ecode());
        builder.addString(columnInfo.emsgColKey, unmanagedSource.realmGet$emsg());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.imooc.viewpagertest.module.search.SearchModel dataObj = unmanagedSource.realmGet$data();
        if (dataObj == null) {
            managedCopy.realmSet$data(null);
        } else {
            com.imooc.viewpagertest.module.search.SearchModel cachedata = (com.imooc.viewpagertest.module.search.SearchModel) cache.get(dataObj);
            if (cachedata != null) {
                managedCopy.realmSet$data(cachedata);
            } else {
                managedCopy.realmSet$data(com_imooc_viewpagertest_module_search_SearchModelRealmProxy.copyOrUpdate(realm, (com_imooc_viewpagertest_module_search_SearchModelRealmProxy.SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class), dataObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$ecode = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
        if (realmGet$ecode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ecodeColKey, objKey, realmGet$ecode, false);
        }
        String realmGet$emsg = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
        if (realmGet$emsg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emsgColKey, objKey, realmGet$emsg, false);
        }

        com.imooc.viewpagertest.module.search.SearchModel dataObj = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$data();
        if (dataObj != null) {
            Long cachedata = cache.get(dataObj);
            if (cachedata == null) {
                cachedata = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insert(realm, dataObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.dataColKey, objKey, cachedata, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        com.imooc.viewpagertest.module.search.BaseSearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.BaseSearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$ecode = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
            if (realmGet$ecode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ecodeColKey, objKey, realmGet$ecode, false);
            }
            String realmGet$emsg = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
            if (realmGet$emsg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emsgColKey, objKey, realmGet$emsg, false);
            }

            com.imooc.viewpagertest.module.search.SearchModel dataObj = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$data();
            if (dataObj != null) {
                Long cachedata = cache.get(dataObj);
                if (cachedata == null) {
                    cachedata = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insert(realm, dataObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.dataColKey, objKey, cachedata, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$ecode = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
        if (realmGet$ecode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ecodeColKey, objKey, realmGet$ecode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ecodeColKey, objKey, false);
        }
        String realmGet$emsg = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
        if (realmGet$emsg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emsgColKey, objKey, realmGet$emsg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emsgColKey, objKey, false);
        }

        com.imooc.viewpagertest.module.search.SearchModel dataObj = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$data();
        if (dataObj != null) {
            Long cachedata = cache.get(dataObj);
            if (cachedata == null) {
                cachedata = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insertOrUpdate(realm, dataObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.dataColKey, objKey, cachedata, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.dataColKey, objKey);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        com.imooc.viewpagertest.module.search.BaseSearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.BaseSearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$ecode = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
            if (realmGet$ecode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ecodeColKey, objKey, realmGet$ecode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ecodeColKey, objKey, false);
            }
            String realmGet$emsg = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
            if (realmGet$emsg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emsgColKey, objKey, realmGet$emsg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emsgColKey, objKey, false);
            }

            com.imooc.viewpagertest.module.search.SearchModel dataObj = ((com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) object).realmGet$data();
            if (dataObj != null) {
                Long cachedata = cache.get(dataObj);
                if (cachedata == null) {
                    cachedata = com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insertOrUpdate(realm, dataObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.dataColKey, objKey, cachedata, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.dataColKey, objKey);
            }
        }
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel createDetachedCopy(com.imooc.viewpagertest.module.search.BaseSearchModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.BaseSearchModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.BaseSearchModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface unmanagedCopy = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) unmanagedObject;
        com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface realmSource = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$ecode(realmSource.realmGet$ecode());
        unmanagedCopy.realmSet$emsg(realmSource.realmGet$emsg());

        // Deep copy of data
        unmanagedCopy.realmSet$data(com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createDetachedCopy(realmSource.realmGet$data(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BaseSearchModel = proxy[");
        stringBuilder.append("{ecode:");
        stringBuilder.append(realmGet$ecode() != null ? realmGet$ecode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{emsg:");
        stringBuilder.append(realmGet$emsg() != null ? realmGet$emsg() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? "SearchModel" : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy aBaseSearchModel = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aBaseSearchModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBaseSearchModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aBaseSearchModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
