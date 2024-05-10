package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FolderOpen16: ImageVector
  get() {
    if (_folderOpen16 != null) {
      return _folderOpen16!!
    }
    _folderOpen16 = fluentIcon(name = "Regular.FolderOpen16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          verticalLineToRelative(4.6F)
          lineToRelative(0.924F, -1.6F)
          curveTo(3.46F, 6.572F, 4.45F, 6.0F, 5.522F, 6.0F)
          horizontalLineToRelative(6.393F)
          curveToRelative(-0.206F, -0.583F, -0.762F, -1.0F, -1.415F, -1.0F)
          horizontalLineTo(7.0F)
          curveTo(6.867F, 5.0F, 6.74F, 4.947F, 6.646F, 4.854F)
          lineTo(4.94F, 3.146F)
          curveTo(4.846F, 3.054F, 4.72F, 3.0F, 4.586F, 3.0F)
          horizontalLineTo(3.5F)
          curveTo(2.672F, 3.0F, 2.0F, 3.672F, 2.0F, 4.5F)
          close()
          moveToRelative(5.069F, 9.495F)
          curveTo(7.046F, 13.998F, 7.023F, 14.0F, 7.0F, 14.0F)
          horizontalLineTo(3.5F)
          curveTo(2.12F, 14.0F, 1.0F, 12.88F, 1.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          curveTo(1.0F, 3.12F, 2.12F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(1.086F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          lineTo(7.207F, 4.0F)
          horizontalLineTo(10.5F)
          curveToRelative(1.224F, 0.0F, 2.243F, 0.88F, 2.458F, 2.041F)
          curveToRelative(1.647F, 0.3F, 2.586F, 2.18F, 1.704F, 3.709F)
          lineToRelative(-1.585F, 2.745F)
          curveToRelative(-0.536F, 0.929F, -1.527F, 1.5F, -2.598F, 1.5F)
          horizontalLineToRelative(-3.41F)
          close()
          moveTo(5.522F, 7.0F)
          curveTo(4.807F, 7.0F, 4.147F, 7.381F, 3.79F, 8.0F)
          lineToRelative(-1.585F, 2.745F)
          curveToRelative(-0.577F, 1.0F, 0.144F, 2.25F, 1.299F, 2.25F)
          horizontalLineToRelative(6.975F)
          curveToRelative(0.714F, 0.0F, 1.374F, -0.38F, 1.732F, -1.0F)
          lineToRelative(1.585F, -2.745F)
          curveToRelative(0.577F, -1.0F, -0.145F, -2.25F, -1.3F, -2.25F)
          horizontalLineTo(5.522F)
          close()        
      }
    }
    return _folderOpen16!!
  }

private var _folderOpen16: ImageVector? = null
