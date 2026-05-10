package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blinds") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 7f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 11f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.BlindsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blinds: ImageVector
    @Composable get() = BlindsDefinition.asImageVector()
