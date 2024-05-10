package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpenVertical16: ImageVector
  get() {
    if (_folderOpenVertical16 != null) {
      return _folderOpenVertical16!!
    }
    _folderOpenVertical16 = fluentIcon(name = "Filled.FolderOpenVertical16", 16f) {
      materialPath {
          moveTo(11.5F, 1.0F)
          horizontalLineTo(6.534F)
          lineTo(8.25F, 1.991F)
          curveTo(9.333F, 2.616F, 10.0F, 3.771F, 10.0F, 5.022F)
          verticalLineToRelative(7.928F)
          curveToRelative(1.141F, -0.232F, 2.0F, -1.24F, 2.0F, -2.45F)
          verticalLineTo(7.207F)
          lineToRelative(1.56F, -1.56F)
          curveTo(13.843F, 5.364F, 14.0F, 4.983F, 14.0F, 4.585F)
          verticalLineTo(3.5F)
          curveTo(14.0F, 2.12F, 12.88F, 1.0F, 11.5F, 1.0F)
          close()
          moveTo(9.0F, 5.022F)
          verticalLineToRelative(7.973F)
          curveToRelative(0.0F, 1.54F, -1.667F, 2.502F, -3.0F, 1.732F)
          lineToRelative(-2.745F, -1.585F)
          curveToRelative(-0.774F, -0.446F, -1.25F, -1.271F, -1.25F, -2.165F)
          verticalLineTo(3.004F)
          curveToRelative(0.0F, -1.54F, 1.667F, -2.502F, 3.0F, -1.732F)
          lineTo(7.75F, 2.857F)
          curveTo(8.524F, 3.304F, 9.0F, 4.13F, 9.0F, 5.022F)
          close()        
      }
    }
    return _folderOpenVertical16!!
  }

private var _folderOpenVertical16: ImageVector? = null
