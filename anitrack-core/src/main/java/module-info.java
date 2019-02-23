open module anitrack.core {
    exports moe.anitrack.core;
    exports moe.anitrack.core.thirdparties;

    requires spring.context;

    requires anitrack.server;

    requires anitrack.thirdparties.common;
    requires anitrack.thirdparties.kitsu;
    requires java.annotation;
    requires slf4j.api;
    requires spring.beans;
    requires spring.boot.autoconfigure;

}
