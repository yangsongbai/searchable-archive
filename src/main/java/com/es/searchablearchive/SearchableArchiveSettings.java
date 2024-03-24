package com.es.searchablearchive;

import org.elasticsearch.common.settings.Setting;
import org.elasticsearch.common.unit.ByteSizeUnit;
import org.elasticsearch.common.unit.ByteSizeValue;

import java.util.List;
import java.util.function.Function;

import static java.util.Collections.emptyList;

/**
 * Created by
 *
 * @Author : yangsongbai1
 * @create 2024/3/23 19:57
 */
public class SearchableArchiveSettings {
    public static final Setting<String> SNAPSHOT_REPOSITORY_SETTING = Setting.simpleString(
            "index.archive.store.repository_name",
            Setting.Property.IndexScope,
            Setting.Property.PrivateIndex,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<String> SNAPSHOT_SNAPSHOT_NAME_SETTING = Setting.simpleString(
            "index.archive.store.snapshot_name",
            Setting.Property.IndexScope,
            Setting.Property.PrivateIndex,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<String> SNAPSHOT_SNAPSHOT_ID_SETTING = Setting.simpleString(
            "index.archive.store.snapshot_uuid",
            Setting.Property.IndexScope,
            Setting.Property.PrivateIndex,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<String> SNAPSHOT_INDEX_NAME_SETTING = Setting.simpleString(
            "index.archive.store.index_name",
            Setting.Property.IndexScope,
            Setting.Property.PrivateIndex,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<String> SNAPSHOT_INDEX_ID_SETTING = Setting.simpleString(
            "index.archive.store.index_uuid",
            Setting.Property.IndexScope,
            Setting.Property.PrivateIndex,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<Boolean> SNAPSHOT_CACHE_ENABLED_SETTING = Setting.boolSetting(
            "index.archive.store.cache.enabled",
            true,
            Setting.Property.IndexScope,
            Setting.Property.NotCopyableOnResize
    );

    public static final Setting<Boolean> SNAPSHOT_CACHE_PREWARM_ENABLED_SETTING = Setting.boolSetting(
            "index.archive.store.cache.prewarm.enabled",
            true,
            Setting.Property.IndexScope,
            Setting.Property.NotCopyableOnResize
    );
    // The file extensions that are excluded from the cache
    public static final Setting<List<String>> SNAPSHOT_CACHE_EXCLUDED_FILE_TYPES_SETTING = Setting.listSetting(
            "index.archive.store.cache.excluded_file_types",
            emptyList(),
            Function.identity(),
            Setting.Property.IndexScope,
            Setting.Property.NodeScope,
            Setting.Property.NotCopyableOnResize
    );
    public static final Setting<ByteSizeValue> SNAPSHOT_UNCACHED_CHUNK_SIZE_SETTING = Setting.byteSizeSetting(
            "index.archive.store.uncached_chunk_size",
            new ByteSizeValue(-1, ByteSizeUnit.BYTES),
            Setting.Property.IndexScope,
            Setting.Property.NodeScope,
            Setting.Property.NotCopyableOnResize
    );

}
