package org.golemites.baseline.plugin.resolver;

import lombok.Data;

@Data
public class BundleDependency {
    private String url;
    private int startLevel;
    private String version;
    private FeatureDependency sourceFeature;
}
