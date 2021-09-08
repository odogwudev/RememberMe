package odogwudev.rememberme.app.view.pflockscreen.security.callbacks;

import odogwudev.rememberme.app.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
