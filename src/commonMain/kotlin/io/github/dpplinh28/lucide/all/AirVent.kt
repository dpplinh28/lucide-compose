package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AirVent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -4f, 2.03f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.6f, 15.572f)
                arcTo(2f, 2f, 0f, true, false, 10f, 17f)
                verticalLineToRelative(-5f)
            }
}

public val LucideIcons.All.AirVentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AirVent: ImageVector
    @Composable get() = AirVentDefinition.asImageVector()
