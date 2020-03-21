package com.cingu.laptop.simplemvp;

public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);

    void onSetProgressBarVisibility(int visibility);
}
