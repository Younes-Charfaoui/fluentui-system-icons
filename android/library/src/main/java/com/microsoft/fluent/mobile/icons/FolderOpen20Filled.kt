package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpen20: ImageVector
  get() {
    if (_folderOpen20 != null) {
      return _folderOpen20!!
    }
    _folderOpen20 = fluentIcon(name = "Filled.FolderOpen20", 20f) {
      materialPath {
          moveTo(4.5F, 3.0F)
          curveTo(3.12F, 3.0F, 2.0F, 4.12F, 2.0F, 5.5F)
          verticalLineToRelative(6.971F)
          lineToRelative(1.568F, -2.716F)
          curveTo(4.194F, 8.672F, 5.35F, 8.005F, 6.6F, 8.005F)
          horizontalLineTo(16.0F)
          verticalLineTo(7.5F)
          curveTo(16.0F, 6.12F, 14.88F, 5.0F, 13.5F, 5.0F)
          horizontalLineTo(9.707F)
          lineToRelative(-1.56F, -1.56F)
          curveTo(7.864F, 3.157F, 7.483F, 3.0F, 7.085F, 3.0F)
          horizontalLineTo(4.5F)
          close()
          moveToRelative(-0.066F, 7.255F)
          curveTo(4.881F, 9.48F, 5.706F, 9.005F, 6.6F, 9.005F)
          horizontalLineToRelative(10.396F)
          curveToRelative(1.54F, 0.0F, 2.502F, 1.666F, 1.732F, 3.0F)
          lineToRelative(-2.162F, 3.745F)
          curveTo(16.12F, 16.523F, 15.293F, 17.0F, 14.4F, 17.0F)
          horizontalLineTo(4.004F)
          curveToRelative(-1.54F, 0.0F, -2.502F, -1.667F, -1.732F, -3.0F)
          lineToRelative(2.162F, -3.745F)
          close()        
      }
    }
    return _folderOpen20!!
  }

private var _folderOpen20: ImageVector? = null
