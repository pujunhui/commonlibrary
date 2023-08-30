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
public class com_imooc_viewpagertest_module_search_ProductModelRealmProxy extends com.imooc.viewpagertest.module.search.ProductModel
    implements RealmObjectProxy, com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface {

    static final class ProductModelColumnInfo extends ColumnInfo {
        long _idColKey;
        long fdcodeColKey;
        long abbrevColKey;
        long spellColKey;
        long typeColKey;
        long timeColKey;

        ProductModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ProductModel");
            this._idColKey = addColumnDetails("_id", "_id", objectSchemaInfo);
            this.fdcodeColKey = addColumnDetails("fdcode", "fdcode", objectSchemaInfo);
            this.abbrevColKey = addColumnDetails("abbrev", "abbrev", objectSchemaInfo);
            this.spellColKey = addColumnDetails("spell", "spell", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
        }

        ProductModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProductModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProductModelColumnInfo src = (ProductModelColumnInfo) rawSrc;
            final ProductModelColumnInfo dst = (ProductModelColumnInfo) rawDst;
            dst._idColKey = src._idColKey;
            dst.fdcodeColKey = src.fdcodeColKey;
            dst.abbrevColKey = src.abbrevColKey;
            dst.spellColKey = src.spellColKey;
            dst.typeColKey = src.typeColKey;
            dst.timeColKey = src.timeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ProductModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.ProductModel> proxyState;

    com_imooc_viewpagertest_module_search_ProductModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProductModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.ProductModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo._idColKey);
    }

    @Override
    public void realmSet$_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo._idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo._idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo._idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo._idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fdcode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fdcodeColKey);
    }

    @Override
    public void realmSet$fdcode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fdcodeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fdcodeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fdcodeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fdcodeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$abbrev() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.abbrevColKey);
    }

    @Override
    public void realmSet$abbrev(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.abbrevColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.abbrevColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.abbrevColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.abbrevColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$spell() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.spellColKey);
    }

    @Override
    public void realmSet$spell(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.spellColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.spellColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.spellColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.spellColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$time() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeColKey);
    }

    @Override
    public void realmSet$time(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.timeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "ProductModel", false, 6, 0);
        builder.addPersistedProperty(NO_ALIAS, "_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "fdcode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "abbrev", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "spell", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProductModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ProductModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ProductModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ProductModel";
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.ProductModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.imooc.viewpagertest.module.search.ProductModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.ProductModel.class, true, excludeFields);

        final com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) obj;
        if (json.has("_id")) {
            if (json.isNull("_id")) {
                objProxy.realmSet$_id(null);
            } else {
                objProxy.realmSet$_id((String) json.getString("_id"));
            }
        }
        if (json.has("fdcode")) {
            if (json.isNull("fdcode")) {
                objProxy.realmSet$fdcode(null);
            } else {
                objProxy.realmSet$fdcode((String) json.getString("fdcode"));
            }
        }
        if (json.has("abbrev")) {
            if (json.isNull("abbrev")) {
                objProxy.realmSet$abbrev(null);
            } else {
                objProxy.realmSet$abbrev((String) json.getString("abbrev"));
            }
        }
        if (json.has("spell")) {
            if (json.isNull("spell")) {
                objProxy.realmSet$spell(null);
            } else {
                objProxy.realmSet$spell((String) json.getString("spell"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("time")) {
            if (json.isNull("time")) {
                objProxy.realmSet$time(null);
            } else {
                objProxy.realmSet$time((String) json.getString("time"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.ProductModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.ProductModel obj = new com.imooc.viewpagertest.module.search.ProductModel();
        final com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$_id(null);
                }
            } else if (name.equals("fdcode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fdcode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fdcode(null);
                }
            } else if (name.equals("abbrev")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$abbrev((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$abbrev(null);
                }
            } else if (name.equals("spell")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$spell((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$spell(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("time")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$time((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$time(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_imooc_viewpagertest_module_search_ProductModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class), false, Collections.<String>emptyList());
        io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy obj = new io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.imooc.viewpagertest.module.search.ProductModel copyOrUpdate(Realm realm, ProductModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.ProductModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.imooc.viewpagertest.module.search.ProductModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.imooc.viewpagertest.module.search.ProductModel copy(Realm realm, ProductModelColumnInfo columnInfo, com.imooc.viewpagertest.module.search.ProductModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.ProductModel) cachedRealmObject;
        }

        com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface unmanagedSource = (com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) newObject;

        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo._idColKey, unmanagedSource.realmGet$_id());
        builder.addString(columnInfo.fdcodeColKey, unmanagedSource.realmGet$fdcode());
        builder.addString(columnInfo.abbrevColKey, unmanagedSource.realmGet$abbrev());
        builder.addString(columnInfo.spellColKey, unmanagedSource.realmGet$spell());
        builder.addString(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addString(columnInfo.timeColKey, unmanagedSource.realmGet$time());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.ProductModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$_id = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$_id();
        if (realmGet$_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._idColKey, objKey, realmGet$_id, false);
        }
        String realmGet$fdcode = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$fdcode();
        if (realmGet$fdcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fdcodeColKey, objKey, realmGet$fdcode, false);
        }
        String realmGet$abbrev = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$abbrev();
        if (realmGet$abbrev != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.abbrevColKey, objKey, realmGet$abbrev, false);
        }
        String realmGet$spell = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$spell();
        if (realmGet$spell != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.spellColKey, objKey, realmGet$spell, false);
        }
        String realmGet$type = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        }
        String realmGet$time = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeColKey, objKey, realmGet$time, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        com.imooc.viewpagertest.module.search.ProductModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.ProductModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$_id = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$_id();
            if (realmGet$_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._idColKey, objKey, realmGet$_id, false);
            }
            String realmGet$fdcode = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$fdcode();
            if (realmGet$fdcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fdcodeColKey, objKey, realmGet$fdcode, false);
            }
            String realmGet$abbrev = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$abbrev();
            if (realmGet$abbrev != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.abbrevColKey, objKey, realmGet$abbrev, false);
            }
            String realmGet$spell = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$spell();
            if (realmGet$spell != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.spellColKey, objKey, realmGet$spell, false);
            }
            String realmGet$type = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            }
            String realmGet$time = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeColKey, objKey, realmGet$time, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.ProductModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$_id = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$_id();
        if (realmGet$_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._idColKey, objKey, realmGet$_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo._idColKey, objKey, false);
        }
        String realmGet$fdcode = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$fdcode();
        if (realmGet$fdcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fdcodeColKey, objKey, realmGet$fdcode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fdcodeColKey, objKey, false);
        }
        String realmGet$abbrev = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$abbrev();
        if (realmGet$abbrev != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.abbrevColKey, objKey, realmGet$abbrev, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.abbrevColKey, objKey, false);
        }
        String realmGet$spell = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$spell();
        if (realmGet$spell != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.spellColKey, objKey, realmGet$spell, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.spellColKey, objKey, false);
        }
        String realmGet$type = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
        }
        String realmGet$time = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeColKey, objKey, realmGet$time, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        com.imooc.viewpagertest.module.search.ProductModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.ProductModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$_id = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$_id();
            if (realmGet$_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._idColKey, objKey, realmGet$_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo._idColKey, objKey, false);
            }
            String realmGet$fdcode = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$fdcode();
            if (realmGet$fdcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fdcodeColKey, objKey, realmGet$fdcode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fdcodeColKey, objKey, false);
            }
            String realmGet$abbrev = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$abbrev();
            if (realmGet$abbrev != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.abbrevColKey, objKey, realmGet$abbrev, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.abbrevColKey, objKey, false);
            }
            String realmGet$spell = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$spell();
            if (realmGet$spell != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.spellColKey, objKey, realmGet$spell, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.spellColKey, objKey, false);
            }
            String realmGet$type = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeColKey, objKey, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeColKey, objKey, false);
            }
            String realmGet$time = ((com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeColKey, objKey, realmGet$time, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeColKey, objKey, false);
            }
        }
    }

    public static com.imooc.viewpagertest.module.search.ProductModel createDetachedCopy(com.imooc.viewpagertest.module.search.ProductModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.ProductModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.ProductModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.ProductModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.ProductModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface unmanagedCopy = (com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) unmanagedObject;
        com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface realmSource = (com_imooc_viewpagertest_module_search_ProductModelRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$fdcode(realmSource.realmGet$fdcode());
        unmanagedCopy.realmSet$abbrev(realmSource.realmGet$abbrev());
        unmanagedCopy.realmSet$spell(realmSource.realmGet$spell());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ProductModel = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id() != null ? realmGet$_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fdcode:");
        stringBuilder.append(realmGet$fdcode() != null ? realmGet$fdcode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{abbrev:");
        stringBuilder.append(realmGet$abbrev() != null ? realmGet$abbrev() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{spell:");
        stringBuilder.append(realmGet$spell() != null ? realmGet$spell() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{time:");
        stringBuilder.append(realmGet$time() != null ? realmGet$time() : "null");
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
        com_imooc_viewpagertest_module_search_ProductModelRealmProxy aProductModel = (com_imooc_viewpagertest_module_search_ProductModelRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aProductModel.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aProductModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aProductModel.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
