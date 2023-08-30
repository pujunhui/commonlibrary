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
public class com_imooc_viewpagertest_module_realm_UserContentRealmProxy extends com.imooc.viewpagertest.module.realm.UserContent
    implements RealmObjectProxy, com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface {

    static final class UserContentColumnInfo extends ColumnInfo {
        long userIdColKey;
        long photoUrlColKey;
        long nameColKey;
        long tickColKey;
        long mobileColKey;
        long passwdColKey;
        long emailColKey;
        long parentColKey;
        long sexColKey;

        UserContentColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserContent");
            this.userIdColKey = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.photoUrlColKey = addColumnDetails("photoUrl", "photoUrl", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.tickColKey = addColumnDetails("tick", "tick", objectSchemaInfo);
            this.mobileColKey = addColumnDetails("mobile", "mobile", objectSchemaInfo);
            this.passwdColKey = addColumnDetails("passwd", "passwd", objectSchemaInfo);
            this.emailColKey = addColumnDetails("email", "email", objectSchemaInfo);
            this.parentColKey = addColumnDetails("parent", "parent", objectSchemaInfo);
            this.sexColKey = addColumnDetails("sex", "sex", objectSchemaInfo);
        }

        UserContentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserContentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserContentColumnInfo src = (UserContentColumnInfo) rawSrc;
            final UserContentColumnInfo dst = (UserContentColumnInfo) rawDst;
            dst.userIdColKey = src.userIdColKey;
            dst.photoUrlColKey = src.photoUrlColKey;
            dst.nameColKey = src.nameColKey;
            dst.tickColKey = src.tickColKey;
            dst.mobileColKey = src.mobileColKey;
            dst.passwdColKey = src.passwdColKey;
            dst.emailColKey = src.emailColKey;
            dst.parentColKey = src.parentColKey;
            dst.sexColKey = src.sexColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserContentColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.realm.UserContent> proxyState;

    com_imooc_viewpagertest_module_realm_UserContentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserContentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.realm.UserContent>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdColKey);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUrlColKey);
    }

    @Override
    public void realmSet$photoUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUrlColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUrlColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUrlColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUrlColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tick() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tickColKey);
    }

    @Override
    public void realmSet$tick(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tickColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.tickColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tickColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tickColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mobile() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mobileColKey);
    }

    @Override
    public void realmSet$mobile(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mobileColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.mobileColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mobileColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mobileColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$passwd() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwdColKey);
    }

    @Override
    public void realmSet$passwd(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailColKey);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$parent() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.parentColKey);
    }

    @Override
    public void realmSet$parent(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.parentColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.parentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.parentColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.parentColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$sex() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sexColKey);
    }

    @Override
    public void realmSet$sex(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sexColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sexColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "UserContent", false, 9, 0);
        builder.addPersistedProperty(NO_ALIAS, "userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "photoUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "tick", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "mobile", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "passwd", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "parent", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "sex", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserContentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserContentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserContent";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserContent";
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.realm.UserContent createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.imooc.viewpagertest.module.realm.UserContent obj = realm.createObjectInternal(com.imooc.viewpagertest.module.realm.UserContent.class, true, excludeFields);

        final com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) obj;
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("photoUrl")) {
            if (json.isNull("photoUrl")) {
                objProxy.realmSet$photoUrl(null);
            } else {
                objProxy.realmSet$photoUrl((String) json.getString("photoUrl"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("tick")) {
            if (json.isNull("tick")) {
                objProxy.realmSet$tick(null);
            } else {
                objProxy.realmSet$tick((String) json.getString("tick"));
            }
        }
        if (json.has("mobile")) {
            if (json.isNull("mobile")) {
                objProxy.realmSet$mobile(null);
            } else {
                objProxy.realmSet$mobile((String) json.getString("mobile"));
            }
        }
        if (json.has("passwd")) {
            if (json.isNull("passwd")) {
                objProxy.realmSet$passwd(null);
            } else {
                objProxy.realmSet$passwd((String) json.getString("passwd"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("parent")) {
            if (json.isNull("parent")) {
                objProxy.realmSet$parent(null);
            } else {
                objProxy.realmSet$parent((String) json.getString("parent"));
            }
        }
        if (json.has("sex")) {
            if (json.isNull("sex")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
            } else {
                objProxy.realmSet$sex((int) json.getInt("sex"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.realm.UserContent createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.realm.UserContent obj = new com.imooc.viewpagertest.module.realm.UserContent();
        final com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface objProxy = (com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("photoUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUrl(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("tick")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tick((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tick(null);
                }
            } else if (name.equals("mobile")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mobile((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mobile(null);
                }
            } else if (name.equals("passwd")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$passwd((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$passwd(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("parent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$parent((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$parent(null);
                }
            } else if (name.equals("sex")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sex((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_imooc_viewpagertest_module_realm_UserContentRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class), false, Collections.<String>emptyList());
        io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy obj = new io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.imooc.viewpagertest.module.realm.UserContent copyOrUpdate(Realm realm, UserContentColumnInfo columnInfo, com.imooc.viewpagertest.module.realm.UserContent object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.imooc.viewpagertest.module.realm.UserContent) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.imooc.viewpagertest.module.realm.UserContent copy(Realm realm, UserContentColumnInfo columnInfo, com.imooc.viewpagertest.module.realm.UserContent newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.realm.UserContent) cachedRealmObject;
        }

        com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface unmanagedSource = (com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) newObject;

        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.userIdColKey, unmanagedSource.realmGet$userId());
        builder.addString(columnInfo.photoUrlColKey, unmanagedSource.realmGet$photoUrl());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.tickColKey, unmanagedSource.realmGet$tick());
        builder.addString(columnInfo.mobileColKey, unmanagedSource.realmGet$mobile());
        builder.addString(columnInfo.passwdColKey, unmanagedSource.realmGet$passwd());
        builder.addString(columnInfo.emailColKey, unmanagedSource.realmGet$email());
        builder.addString(columnInfo.parentColKey, unmanagedSource.realmGet$parent());
        builder.addInteger(columnInfo.sexColKey, unmanagedSource.realmGet$sex());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.realm.UserContent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$userId = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        }
        String realmGet$photoUrl = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlColKey, objKey, realmGet$photoUrl, false);
        }
        String realmGet$name = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$tick = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$tick();
        if (realmGet$tick != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tickColKey, objKey, realmGet$tick, false);
        }
        String realmGet$mobile = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$mobile();
        if (realmGet$mobile != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileColKey, objKey, realmGet$mobile, false);
        }
        String realmGet$passwd = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdColKey, objKey, realmGet$passwd, false);
        }
        String realmGet$email = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
        }
        String realmGet$parent = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.parentColKey, objKey, realmGet$parent, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexColKey, objKey, ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$sex(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        com.imooc.viewpagertest.module.realm.UserContent object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.realm.UserContent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$userId = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            }
            String realmGet$photoUrl = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlColKey, objKey, realmGet$photoUrl, false);
            }
            String realmGet$name = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$tick = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$tick();
            if (realmGet$tick != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tickColKey, objKey, realmGet$tick, false);
            }
            String realmGet$mobile = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$mobile();
            if (realmGet$mobile != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileColKey, objKey, realmGet$mobile, false);
            }
            String realmGet$passwd = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdColKey, objKey, realmGet$passwd, false);
            }
            String realmGet$email = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
            }
            String realmGet$parent = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$parent();
            if (realmGet$parent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.parentColKey, objKey, realmGet$parent, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexColKey, objKey, ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$sex(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.realm.UserContent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$userId = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
        }
        String realmGet$photoUrl = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlColKey, objKey, realmGet$photoUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlColKey, objKey, false);
        }
        String realmGet$name = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$tick = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$tick();
        if (realmGet$tick != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tickColKey, objKey, realmGet$tick, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tickColKey, objKey, false);
        }
        String realmGet$mobile = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$mobile();
        if (realmGet$mobile != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileColKey, objKey, realmGet$mobile, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mobileColKey, objKey, false);
        }
        String realmGet$passwd = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdColKey, objKey, realmGet$passwd, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwdColKey, objKey, false);
        }
        String realmGet$email = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, objKey, false);
        }
        String realmGet$parent = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.parentColKey, objKey, realmGet$parent, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.parentColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexColKey, objKey, ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$sex(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        com.imooc.viewpagertest.module.realm.UserContent object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.realm.UserContent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$userId = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
            }
            String realmGet$photoUrl = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlColKey, objKey, realmGet$photoUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlColKey, objKey, false);
            }
            String realmGet$name = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$tick = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$tick();
            if (realmGet$tick != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tickColKey, objKey, realmGet$tick, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tickColKey, objKey, false);
            }
            String realmGet$mobile = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$mobile();
            if (realmGet$mobile != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileColKey, objKey, realmGet$mobile, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mobileColKey, objKey, false);
            }
            String realmGet$passwd = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdColKey, objKey, realmGet$passwd, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwdColKey, objKey, false);
            }
            String realmGet$email = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailColKey, objKey, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailColKey, objKey, false);
            }
            String realmGet$parent = ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$parent();
            if (realmGet$parent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.parentColKey, objKey, realmGet$parent, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.parentColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexColKey, objKey, ((com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) object).realmGet$sex(), false);
        }
    }

    public static com.imooc.viewpagertest.module.realm.UserContent createDetachedCopy(com.imooc.viewpagertest.module.realm.UserContent realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.realm.UserContent unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.realm.UserContent();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.realm.UserContent) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.realm.UserContent) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface unmanagedCopy = (com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) unmanagedObject;
        com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface realmSource = (com_imooc_viewpagertest_module_realm_UserContentRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$photoUrl(realmSource.realmGet$photoUrl());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$tick(realmSource.realmGet$tick());
        unmanagedCopy.realmSet$mobile(realmSource.realmGet$mobile());
        unmanagedCopy.realmSet$passwd(realmSource.realmGet$passwd());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$parent(realmSource.realmGet$parent());
        unmanagedCopy.realmSet$sex(realmSource.realmGet$sex());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserContent = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUrl:");
        stringBuilder.append(realmGet$photoUrl() != null ? realmGet$photoUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tick:");
        stringBuilder.append(realmGet$tick() != null ? realmGet$tick() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mobile:");
        stringBuilder.append(realmGet$mobile() != null ? realmGet$mobile() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{passwd:");
        stringBuilder.append(realmGet$passwd() != null ? realmGet$passwd() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parent:");
        stringBuilder.append(realmGet$parent() != null ? realmGet$parent() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sex:");
        stringBuilder.append(realmGet$sex());
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
        com_imooc_viewpagertest_module_realm_UserContentRealmProxy aUserContent = (com_imooc_viewpagertest_module_realm_UserContentRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUserContent.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserContent.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUserContent.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
