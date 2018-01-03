package com.example.wxc575843.jinshu;

import java.io.File;

/**
 * Created by wxc575843 on 18/1/3.
 */
abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
