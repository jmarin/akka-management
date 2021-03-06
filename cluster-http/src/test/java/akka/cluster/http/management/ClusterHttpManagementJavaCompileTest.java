/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package akka.cluster.http.management;

import akka.actor.ActorSystem;
import akka.cluster.Cluster;
import org.junit.Test;

public class ClusterHttpManagementJavaCompileTest {

    public void test() {
        ActorSystem actorSystem = ActorSystem.create("test");
        Cluster cluster = Cluster.get(actorSystem);
        ClusterHttpManagement x = ClusterHttpManagement.create(cluster);
        x.start();
    }

    @Test
    public void compileOnly() {}
}
