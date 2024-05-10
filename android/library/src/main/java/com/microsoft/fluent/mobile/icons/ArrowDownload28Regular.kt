package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowDownload28: ImageVector
  get() {
    if (_arrowDownload28 != null) {
      return _arrowDownload28!!
    }
    _arrowDownload28 = fluentIcon(name = "Regular.ArrowDownload28", 28f) {
      materialPath {
          moveTo(14.75F, 3.75F)
          curveTo(14.75F, 3.336F, 14.414F, 3.0F, 14.0F, 3.0F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(14.69F)
          lineToRelative(-4.97F, -4.97F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(6.25F, 6.25F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(6.25F, -6.25F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-4.97F, 4.97F)
          verticalLineTo(3.75F)
          close()
          moveToRelative(-9.0F, 19.75F)
          curveTo(5.336F, 23.5F, 5.0F, 23.835F, 5.0F, 24.25F)
          curveTo(5.0F, 24.664F, 5.336F, 25.0F, 5.75F, 25.0F)
          horizontalLineToRelative(16.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          curveToRelative(0.0F, -0.415F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineTo(5.75F)
          close()        
      }
    }
    return _arrowDownload28!!
  }

private var _arrowDownload28: ImageVector? = null
