package com.es.searchablearchive;

import org.apache.lucene.util.SetOnce;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.engine.EngineFactory;
import org.elasticsearch.plugins.ActionPlugin;
import org.elasticsearch.plugins.ClusterPlugin;
import org.elasticsearch.plugins.EnginePlugin;
import org.elasticsearch.plugins.IndexStorePlugin;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.plugins.SystemIndexPlugin;
import org.elasticsearch.threadpool.ThreadPool;

import java.util.Map;
import java.util.Optional;

/**
 * Created by
 *
 * @Author : yangsongbai1
 * @create 2024/3/23 13:57
 */
public class SearchableArchivePlugin  extends Plugin implements IndexStorePlugin, EnginePlugin, ActionPlugin, ClusterPlugin, SystemIndexPlugin {


    private final SetOnce<ThreadPool> threadPool = new SetOnce<>();
    private final Settings settings;

    public SearchableArchivePlugin(Settings settings) {
        this.settings = settings;
    }


    @Override
    public Optional<EngineFactory> getEngineFactory(IndexSettings indexSettings) {
        return Optional.empty();
    }

    @Override
    public Map<String, DirectoryFactory> getDirectoryFactories() {
        return null;
    }
}
