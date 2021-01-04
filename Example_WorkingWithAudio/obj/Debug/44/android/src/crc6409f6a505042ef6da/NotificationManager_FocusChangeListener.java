package crc6409f6a505042ef6da;


public class NotificationManager_FocusChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnAudioFocusChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioFocusChange:(I)V:GetOnAudioFocusChange_IHandler:Android.Media.AudioManager/IOnAudioFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Example_WorkingWithAudio.NotificationManager+FocusChangeListener, Example_WorkingWithAudio", NotificationManager_FocusChangeListener.class, __md_methods);
	}


	public NotificationManager_FocusChangeListener ()
	{
		super ();
		if (getClass () == NotificationManager_FocusChangeListener.class)
			mono.android.TypeManager.Activate ("Example_WorkingWithAudio.NotificationManager+FocusChangeListener, Example_WorkingWithAudio", "", this, new java.lang.Object[] {  });
	}


	public void onAudioFocusChange (int p0)
	{
		n_onAudioFocusChange (p0);
	}

	private native void n_onAudioFocusChange (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
