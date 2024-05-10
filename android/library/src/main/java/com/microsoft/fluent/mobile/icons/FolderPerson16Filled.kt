package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderPerson16: ImageVector
  get() {
    if (_folderPerson16 != null) {
      return _folderPerson16!!
    }
    _folderPerson16 = fluentIcon(name = "Filled.FolderPerson16", 16f) {
      materialPath {
          moveTo(3.5F, 2.0F)
          curveTo(2.12F, 2.0F, 1.0F, 3.12F, 1.0F, 4.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(4.586F)
          curveToRelative(0.132F, 0.0F, 0.26F, -0.053F, 0.353F, -0.146F)
          lineTo(8.0F, 3.793F)
          lineTo(6.646F, 2.439F)
          curveTo(6.366F, 2.158F, 5.984F, 2.0F, 5.586F, 2.0F)
          horizontalLineTo(3.5F)
          close()
          moveTo(1.0F, 11.5F)
          verticalLineTo(7.0F)
          horizontalLineToRelative(4.586F)
          curveToRelative(0.398F, 0.0F, 0.78F, -0.158F, 1.06F, -0.44F)
          lineTo(9.207F, 4.0F)
          horizontalLineTo(12.5F)
          curveTo(13.88F, 4.0F, 15.0F, 5.12F, 15.0F, 6.5F)
          verticalLineToRelative(0.841F)
          curveTo(14.463F, 6.533F, 13.543F, 6.0F, 12.5F, 6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, 1.343F, -3.0F, 3.0F)
          curveToRelative(0.0F, 0.773F, 0.293F, 1.478F, 0.773F, 2.01F)
          curveTo(8.999F, 11.125F, 8.0F, 12.196F, 8.0F, 13.5F)
          curveToRelative(0.0F, 0.167F, 0.013F, 0.334F, 0.038F, 0.5F)
          horizontalLineTo(3.5F)
          curveTo(2.12F, 14.0F, 1.0F, 12.88F, 1.0F, 11.5F)
          close()
          moveTo(14.5F, 9.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(1.5F, 4.5F)
          curveToRelative(0.0F, 1.245F, -1.0F, 2.5F, -3.5F, 2.5F)
          reflectiveCurveTo(9.0F, 14.75F, 9.0F, 13.5F)
          curveToRelative(0.0F, -0.828F, 0.672F, -1.5F, 1.5F, -1.5F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, 0.672F, 1.5F, 1.5F)
          close()        
      }
    }
    return _folderPerson16!!
  }

private var _folderPerson16: ImageVector? = null
