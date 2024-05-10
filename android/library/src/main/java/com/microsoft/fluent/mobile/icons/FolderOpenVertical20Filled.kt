package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpenVertical20: ImageVector
  get() {
    if (_folderOpenVertical20 != null) {
      return _folderOpenVertical20!!
    }
    _folderOpenVertical20 = fluentIcon(name = "Filled.FolderOpenVertical20", 20f) {
      materialPath {
          moveTo(17.0F, 4.5F)
          curveTo(17.0F, 3.12F, 15.88F, 2.0F, 14.5F, 2.0F)
          horizontalLineTo(7.529F)
          lineToRelative(2.716F, 1.568F)
          curveToRelative(1.083F, 0.626F, 1.75F, 1.781F, 1.75F, 3.031F)
          verticalLineTo(16.0F)
          horizontalLineTo(12.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineTo(9.707F)
          lineToRelative(1.56F, -1.56F)
          curveTo(16.843F, 7.864F, 17.0F, 7.483F, 17.0F, 7.085F)
          verticalLineTo(4.5F)
          close()
          moveTo(9.745F, 4.434F)
          curveToRelative(0.774F, 0.447F, 1.25F, 1.272F, 1.25F, 2.165F)
          verticalLineToRelative(10.396F)
          curveToRelative(0.0F, 1.54F, -1.666F, 2.502F, -3.0F, 1.732F)
          lineTo(4.25F, 16.565F)
          curveTo(3.477F, 16.12F, 3.0F, 15.293F, 3.0F, 14.4F)
          verticalLineTo(4.004F)
          curveToRelative(0.0F, -1.54F, 1.667F, -2.502F, 3.0F, -1.732F)
          lineToRelative(3.745F, 2.162F)
          close()        
      }
    }
    return _folderOpenVertical20!!
  }

private var _folderOpenVertical20: ImageVector? = null
