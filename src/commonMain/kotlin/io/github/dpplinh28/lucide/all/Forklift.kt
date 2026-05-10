package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forklift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 19f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(3.828f, 3.828f)
                arcTo(2f, 2f, 0f, false, true, 16f, 10.828f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 19f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ForkliftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forklift: ImageVector
    @Composable get() = ForkliftDefinition.asImageVector()
