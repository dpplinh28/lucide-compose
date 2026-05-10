package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryWarning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 7f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 6f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.BatteryWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryWarning: ImageVector
    @Composable get() = BatteryWarningDefinition.asImageVector()
