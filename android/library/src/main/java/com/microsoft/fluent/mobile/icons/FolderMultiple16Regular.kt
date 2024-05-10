package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FolderMultiple16: ImageVector
  get() {
    if (_folderMultiple16 != null) {
      return _folderMultiple16!!
    }
    _folderMultiple16 = fluentIcon(name = "Regular.FolderMultiple16", 16f) {
      materialPath {
          moveTo(3.5F, 3.0F)
          curveTo(2.672F, 3.0F, 2.0F, 3.672F, 2.0F, 4.5F)
          verticalLineTo(5.0F)
          horizontalLineToRelative(3.086F)
          curveToRelative(0.132F, 0.0F, 0.26F, -0.053F, 0.353F, -0.146F)
          lineTo(6.293F, 4.0F)
          lineTo(5.439F, 3.147F)
          curveTo(5.346F, 3.053F, 5.22F, 3.0F, 5.086F, 3.0F)
          horizontalLineTo(3.5F)
          close()
          moveTo(1.0F, 4.441F)
          curveTo(1.0F, 4.425F, 1.0F, 4.41F, 1.002F, 4.394F)
          curveTo(1.058F, 3.062F, 2.155F, 2.0F, 3.5F, 2.0F)
          horizontalLineToRelative(1.586F)
          curveToRelative(0.398F, 0.0F, 0.78F, 0.158F, 1.06F, 0.44F)
          lineTo(7.207F, 3.5F)
          horizontalLineTo(10.5F)
          curveTo(11.88F, 3.5F, 13.0F, 4.62F, 13.0F, 6.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(2.12F, 12.0F, 1.0F, 10.88F, 1.0F, 9.5F)
          verticalLineTo(4.441F)
          close()
          moveTo(7.207F, 4.5F)
          lineToRelative(-1.06F, 1.06F)
          curveTo(5.864F, 5.843F, 5.483F, 6.0F, 5.085F, 6.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(3.5F)
          curveTo(2.0F, 10.328F, 2.672F, 11.0F, 3.5F, 11.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -0.828F, -0.672F, -1.5F, -1.5F, -1.5F)
          horizontalLineTo(7.207F)
          close()
          moveTo(14.0F, 6.0F)
          curveToRelative(0.607F, 0.456F, 1.0F, 1.182F, 1.0F, 2.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 2.486F, -2.014F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-5.0F)
          curveToRelative(-0.818F, 0.0F, -1.544F, -0.393F, -2.0F, -1.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineTo(6.0F)
          close()        
      }
    }
    return _folderMultiple16!!
  }

private var _folderMultiple16: ImageVector? = null
