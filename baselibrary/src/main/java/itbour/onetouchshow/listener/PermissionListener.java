package itbour.onetouchshow.listener;

import java.util.List;

public interface PermissionListener {
    void onGranted();

    void onDenied(List<String> deniedPermissions);
}