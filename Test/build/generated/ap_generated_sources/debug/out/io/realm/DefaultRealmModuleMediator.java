package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(5);
        modelClasses.add(com.imooc.viewpagertest.module.search.SearchModel.class);
        modelClasses.add(com.imooc.viewpagertest.module.search.ProductModel.class);
        modelClasses.add(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        modelClasses.add(com.imooc.viewpagertest.module.realm.UserContent.class);
        modelClasses.add(com.imooc.viewpagertest.module.realm.User.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(5);
        infoMap.put(com.imooc.viewpagertest.module.search.SearchModel.class, io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.search.ProductModel.class, io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.search.BaseSearchModel.class, io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.realm.UserContent.class, io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.realm.User.class, io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return "SearchModel";
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return "ProductModel";
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return "BaseSearchModel";
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return "UserContent";
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return "User";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public Class<? extends RealmModel> getClazzImpl(String className) {
        checkClassName(className);

        if (className.equals("SearchModel")) {
            return com.imooc.viewpagertest.module.search.SearchModel.class;
        }
        if (className.equals("ProductModel")) {
            return com.imooc.viewpagertest.module.search.ProductModel.class;
        }
        if (className.equals("BaseSearchModel")) {
            return com.imooc.viewpagertest.module.search.BaseSearchModel.class;
        }
        if (className.equals("UserContent")) {
            return com.imooc.viewpagertest.module.realm.UserContent.class;
        }
        if (className.equals("User")) {
            return com.imooc.viewpagertest.module.realm.User.class;
        }
        throw getMissingProxyClassException(className);
    }

    @Override
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> clazz) {
        return false;
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                return clazz.cast(new io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                return clazz.cast(new io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                return clazz.cast(new io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                return clazz.cast(new io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                return clazz.cast(new io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            com_imooc_viewpagertest_module_search_SearchModelRealmProxy.SearchModelColumnInfo columnInfo = (com_imooc_viewpagertest_module_search_SearchModelRealmProxy.SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.imooc.viewpagertest.module.search.SearchModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            com_imooc_viewpagertest_module_search_ProductModelRealmProxy.ProductModelColumnInfo columnInfo = (com_imooc_viewpagertest_module_search_ProductModelRealmProxy.ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.imooc.viewpagertest.module.search.ProductModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.BaseSearchModelColumnInfo columnInfo = (com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.copyOrUpdate(realm, columnInfo, (com.imooc.viewpagertest.module.search.BaseSearchModel) obj, update, cache, flags));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            com_imooc_viewpagertest_module_realm_UserContentRealmProxy.UserContentColumnInfo columnInfo = (com_imooc_viewpagertest_module_realm_UserContentRealmProxy.UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.copyOrUpdate(realm, columnInfo, (com.imooc.viewpagertest.module.realm.UserContent) obj, update, cache, flags));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            com_imooc_viewpagertest_module_realm_UserRealmProxy.UserColumnInfo columnInfo = (com_imooc_viewpagertest_module_realm_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.User.class);
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.imooc.viewpagertest.module.realm.User) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public long insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                    io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                    io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public long insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.SearchModel) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.ProductModel) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.UserContent) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.User) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                    io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                    io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                    io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_SearchModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.SearchModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_ProductModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.ProductModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_search_BaseSearchModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.BaseSearchModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserContentRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.realm.UserContent) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.com_imooc_viewpagertest_module_realm_UserRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.realm.User) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return false;
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return false;
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return false;
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return false;
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            throw getNotEmbeddedClassException("com.imooc.viewpagertest.module.search.SearchModel");
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            throw getNotEmbeddedClassException("com.imooc.viewpagertest.module.search.ProductModel");
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            throw getNotEmbeddedClassException("com.imooc.viewpagertest.module.search.BaseSearchModel");
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            throw getNotEmbeddedClassException("com.imooc.viewpagertest.module.realm.UserContent");
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            throw getNotEmbeddedClassException("com.imooc.viewpagertest.module.realm.User");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
