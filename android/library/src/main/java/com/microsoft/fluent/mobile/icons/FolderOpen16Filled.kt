package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpen16: ImageVector
  get() {
    if (_folderOpen16 != null) {
      return _folderOpen16!!
    }
    _folderOpen16 = fluentIcon(name = "Filled.FolderOpen16", 16f) {
      materialPath {
          moveTo(1.0F, 4.5F)
          verticalLineToRelative(4.966F)
          lineTo(1.991F, 7.75F)
          curveTo(2.616F, 6.667F, 3.771F, 6.0F, 5.022F, 6.0F)
          horizontalLineToRelative(7.928F)
          curveToRelative(-0.232F, -1.141F, -1.24F, -2.0F, -2.45F, -2.0F)
          horizontalLineTo(7.207F)
          lineToRelative(-1.56F, -1.56F)
          curveTo(5.364F, 2.157F, 4.983F, 2.0F, 4.585F, 2.0F)
          horizontalLineTo(3.5F)
          curveTo(2.12F, 2.0F, 1.0F, 3.12F, 1.0F, 4.5F)
          close()
          moveTo(5.022F, 7.0F)
          horizontalLineToRelative(7.973F)
          curveToRelative(1.54F, 0.0F, 2.502F, 1.667F, 1.732F, 3.0F)
          lineToRelative(-1.585F, 2.745F)
          curveToRelative(-0.446F, 0.774F, -1.271F, 1.25F, -2.165F, 1.25F)
          horizontalLineTo(3.004F)
          curveToRelative(-1.54F, 0.0F, -2.502F, -1.666F, -1.732F, -3.0F)
          lineTo(2.857F, 8.25F)
          curveTo(3.304F, 7.476F, 4.13F, 7.0F, 5.022F, 7.0F)
          close()        
      }
    }
    return _folderOpen16!!
  }

private var _folderOpen16: ImageVector? = null
