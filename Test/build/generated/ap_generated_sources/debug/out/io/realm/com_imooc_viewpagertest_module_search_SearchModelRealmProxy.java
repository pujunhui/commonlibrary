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
public class com_imooc_viewpagertest_module_search_SearchModelRealmProxy extends com.imooc.viewpagertest.module.search.SearchModel
    implements RealmObjectProxy, com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface {

    static final class SearchModelColumnInfo extends ColumnInfo {
        long uptimeColKey;
        long listColKey;

        SearchModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SearchModel");
            this.uptimeColKey = addColumnDetails("uptime", "uptime", objectSchemaInfo);
            this.listColKey = addColumnDetails("list", "list", objectSchemaInfo);
        }

        SearchModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SearchModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SearchModelColumnInfo src = (SearchModelColumnInfo) rawSrc;
            final SearchModelColumnInfo dst = (SearchModelColumnInfo) rawDst;
            dst.uptimeColKey = src.uptimeColKey;
            dst.listColKey = src.listColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SearchModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.SearchModel> proxyState;
    private RealmList<com.imooc.viewpagertest.module.search.ProductModel> listRealmList;

    com_imooc_viewpagertest_module_search_SearchModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SearchModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.SearchModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$uptime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.uptimeColKey);
    }

    @Override
    public void realmSet$uptime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.uptimeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.uptimeColKey, value);
    }

    @Override
    public RealmList<com.imooc.viewpagertest.module.search.ProductModel> realmGet$list() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (listRealmList != null) {
            return listRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listColKey);
            listRealmList = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>(com.imooc.viewpagertest.module.search.ProductModel.class, osList, proxyState.getRealm$realm());
            return listRealmList;
        }
    }

    @Override
    public void realmSet$list(RealmList<com.imooc.viewpagertest.module.search.ProductModel> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("list")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.imooc.viewpagertest.module.search.ProductModel> original = value;
                value = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>();
                for (com.imooc.viewpagertest.module.search.ProductModel item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.imooc.viewpagertest.module.search.ProductModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.imooc.viewpagertest.module.search.ProductModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "SearchModel", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "uptime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty(NO_ALIAS, "list", RealmFieldType.LIST, "ProductModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SearchModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SearchModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SearchModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SearchModel";
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.SearchModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("list")) {
            excludeFields.add("list");
        }
        com.imooc.viewpagertest.module.search.SearchModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.SearchModel.class, true, excludeFields);

        final com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) obj;
        if (json.has("uptime")) {
            if (json.isNull("uptime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uptime' to null.");
            } else {
                objProxy.realmSet$uptime((long) json.getLong("uptime"));
            }
        }
        if (json.has("list")) {
            if (json.isNull("list")) {
                objProxy.realmSet$list(null);
            } else {
                objProxy.realmGet$list().clear();
                JSONArray array = json.getJSONArray("list");
                for (int i = 0; i < array.length(); i++) {
                    com.imooc.viewpagertest.module.search.ProductModel item = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$list().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.SearchModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.SearchModel obj = new com.imooc.viewpagertest.module.search.SearchModel();
        final com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("uptime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uptime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'uptime' to null.");
                }
            } else if (name.equals("list")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$list(null);
                } else {
                    objProxy.realmSet$list(new RealmList<com.imooc.viewpagertest.module.search.ProductModel>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.imooc.viewpagertest.module.search.ProductModel item = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$list().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_imooc_viewpagertest_module_search_SearchModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class), false, Collections.<String>emptyList());
        io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy obj = new io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.imooc.viewpagertest.module.search.SearchModel copyOrUpdate(Realm realm, SearchModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.SearchModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.imooc.viewpagertest.module.search.SearchModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.imooc.viewpagertest.module.search.SearchModel copy(Realm realm, SearchModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.SearchModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.SearchModel) cachedRealmObject;
        }

        com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface unmanagedSource = (com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.uptimeColKey, unmanagedSource.realmGet$uptime());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listUnmanagedList = unmanagedSource.realmGet$list();
        if (listUnmanagedList != null) {
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listManagedList = managedCopy.realmGet$list();
            listManagedList.clear();
            for (int i = 0; i < listUnmanagedList.size(); i++) {
                com.imooc.viewpagertest.module.search.ProductModel listUnmanagedItem = listUnmanagedList.get(i);
                com.imooc.viewpagertest.module.search.ProductModel cachelist = (com.imooc.viewpagertest.module.search.ProductModel) cache.get(listUnmanagedItem);
                if (cachelist != null) {
                    listManagedList.add(cachelist);
                } else {
                    listManagedList.add(com_imooc_viewpagertest_module_search_ProductModelRealmProxy.copyOrUpdate(realm, (com_imooc_viewpagertest_module_search_ProductModelRealmProxy.ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class), listUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.SearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.uptimeColKey, objKey, ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$list();
        if (listList != null) {
            OsList listOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.listColKey);
            for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insert(realm, listItem, cache);
                }
                listOsList.addRow(cacheItemIndexlist);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        com.imooc.viewpagertest.module.search.SearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.SearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.uptimeColKey, objKey, ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$list();
            if (listList != null) {
                OsList listOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.listColKey);
                for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insert(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.SearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.uptimeColKey, objKey, ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

        OsList listOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.listColKey);
        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$list();
        if (listList != null && listList.size() == listOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objectCount = listList.size();
            for (int i = 0; i < objectCount; i++) {
                com.imooc.viewpagertest.module.search.ProductModel listItem = listList.get(i);
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                }
                listOsList.setRow(i, cacheItemIndexlist);
            }
        } else {
            listOsList.removeAll();
            if (listList != null) {
                for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        com.imooc.viewpagertest.module.search.SearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.SearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.uptimeColKey, objKey, ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

            OsList listOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.listColKey);
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) object).realmGet$list();
            if (listList != null && listList.size() == listOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = listList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.imooc.viewpagertest.module.search.ProductModel listItem = listList.get(i);
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.setRow(i, cacheItemIndexlist);
                }
            } else {
                listOsList.removeAll();
                if (listList != null) {
                    for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                        Long cacheItemIndexlist = cache.get(listItem);
                        if (cacheItemIndexlist == null) {
                            cacheItemIndexlist = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                        }
                        listOsList.addRow(cacheItemIndexlist);
                    }
                }
            }

        }
    }

    public static com.imooc.viewpagertest.module.search.SearchModel createDetachedCopy(com.imooc.viewpagertest.module.search.SearchModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.SearchModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.SearchModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.SearchModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.SearchModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface unmanagedCopy = (com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) unmanagedObject;
        com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface realmSource = (com_imooc_viewpagertest_module_search_SearchModelRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$uptime(realmSource.realmGet$uptime());

        // Deep copy of list
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$list(null);
        } else {
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> managedlistList = realmSource.realmGet$list();
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> unmanagedlistList = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>();
            unmanagedCopy.realmSet$list(unmanagedlistList);
            int nextDepth = currentDepth + 1;
            int size = managedlistList.size();
            for (int i = 0; i < size; i++) {
                com.imooc.viewpagertest.module.search.ProductModel item = com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createDetachedCopy(managedlistList.get(i), nextDepth, maxDepth, cache);
                unmanagedlistList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SearchModel = proxy[");
        stringBuilder.append("{uptime:");
        stringBuilder.append(realmGet$uptime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{list:");
        stringBuilder.append("RealmList<ProductModel>[").append(realmGet$list().size()).append("]");
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
        com_imooc_viewpagertest_module_search_SearchModelRealmProxy aSearchModel = (com_imooc_viewpagertest_module_search_SearchModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSearchModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSearchModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSearchModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
