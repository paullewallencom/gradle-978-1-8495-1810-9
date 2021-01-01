package sample

class Version {
    int major, minor, revision
    boolean release

    String toString() {
        release ? "$major.$minor.$revision" : "$major.$minor.$revision-SNAPSHOT"
    }
}
