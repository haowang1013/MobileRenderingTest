package com.epicgames.ue4;

import com.directivegames.MobileRenderingTest.OBBDownloaderService;
import com.directivegames.MobileRenderingTest.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

