package com.thalesgroup.hudson.plugins.jobrevision;

import hudson.init.InitMilestone;
import hudson.init.Initializer;
import hudson.model.Items;

/**
 * @author Gregory Boissinot
 */
public class AliasInitializer {

    @Initializer(before = InitMilestone.PLUGINS_STARTED)
    @SuppressWarnings("unused")
    public static void addAliases() {
        Items.XSTREAM.alias("JobRevision", JobRevision.class);
    }
}
