package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TabDesktopMultiple24: ImageVector
  get() {
    if (_tabDesktopMultiple24 != null) {
      return _tabDesktopMultiple24!!
    }
    _tabDesktopMultiple24 = fluentIcon(name = "Filled.TabDesktopMultiple24", 24f) {
      materialPath {
          moveTo(19.0F, 6.01F)
          curveToRelative(1.68F, 0.126F, 3.002F, 1.529F, 3.002F, 3.24F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 2.623F, -2.126F, 4.75F, -4.75F, 4.75F)
          horizontalLineToRelative(-8.0F)
          curveToRelative(-1.71F, 0.0F, -3.113F, -1.322F, -3.24F, -3.0F)
          horizontalLineToRelative(8.739F)
          curveToRelative(2.347F, 0.0F, 4.25F, -1.903F, 4.25F, -4.25F)
          verticalLineTo(6.01F)
          close()
          moveTo(5.25F, 2.0F)
          curveTo(3.455F, 2.0F, 2.0F, 3.455F, 2.0F, 5.25F)
          verticalLineToRelative(9.5F)
          curveTo(2.0F, 16.545F, 3.455F, 18.0F, 5.25F, 18.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(7.5F)
          horizontalLineToRelative(-7.25F)
          curveTo(9.507F, 7.5F, 8.5F, 6.493F, 8.5F, 5.25F)
          verticalLineTo(2.0F)
          horizontalLineTo(5.25F)
          close()
          moveToRelative(5.5F, 4.0F)
          horizontalLineTo(18.0F)
          verticalLineTo(5.25F)
          curveTo(18.0F, 3.455F, 16.545F, 2.0F, 14.75F, 2.0F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(3.25F)
          curveTo(10.0F, 5.664F, 10.336F, 6.0F, 10.75F, 6.0F)
          close()        
      }
    }
    return _tabDesktopMultiple24!!
  }

private var _tabDesktopMultiple24: ImageVector? = null
