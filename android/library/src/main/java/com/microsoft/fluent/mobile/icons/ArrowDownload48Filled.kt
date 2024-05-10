package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowDownload48: ImageVector
  get() {
    if (_arrowDownload48 != null) {
      return _arrowDownload48!!
    }
    _arrowDownload48 = fluentIcon(name = "Filled.ArrowDownload48", 48f) {
      materialPath {
          moveTo(25.5F, 6.5F)
          curveTo(25.5F, 5.672F, 24.828F, 5.0F, 24.0F, 5.0F)
          reflectiveCurveToRelative(-1.5F, 0.672F, -1.5F, 1.5F)
          verticalLineToRelative(25.379F)
          lineToRelative(-7.94F, -7.94F)
          curveToRelative(-0.585F, -0.585F, -1.535F, -0.585F, -2.12F, 0.0F)
          curveToRelative(-0.586F, 0.586F, -0.586F, 1.536F, 0.0F, 2.122F)
          lineToRelative(10.5F, 10.5F)
          curveToRelative(0.585F, 0.585F, 1.535F, 0.585F, 2.12F, 0.0F)
          lineToRelative(10.5F, -10.5F)
          curveToRelative(0.586F, -0.586F, 0.586F, -1.536F, 0.0F, -2.122F)
          curveToRelative(-0.585F, -0.585F, -1.535F, -0.585F, -2.12F, 0.0F)
          lineToRelative(-7.94F, 7.94F)
          verticalLineTo(6.5F)
          close()
          moveTo(10.5F, 40.0F)
          curveTo(9.672F, 40.0F, 9.0F, 40.672F, 9.0F, 41.5F)
          reflectiveCurveTo(9.672F, 43.0F, 10.5F, 43.0F)
          horizontalLineToRelative(27.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveTo(38.328F, 40.0F, 37.5F, 40.0F)
          horizontalLineToRelative(-27.0F)
          close()        
      }
    }
    return _arrowDownload48!!
  }

private var _arrowDownload48: ImageVector? = null
