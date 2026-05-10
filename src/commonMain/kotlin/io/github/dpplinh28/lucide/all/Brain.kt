package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 13f)
                arcToRelative(4.17f, 4.17f, 0f, false, true, -3f, -4f)
                arcToRelative(4.17f, 4.17f, 0f, false, true, -3f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.598f, 6.5f)
                arcTo(3f, 3f, 0f, true, false, 12f, 5f)
                arcToRelative(3f, 3f, 0f, true, false, -5.598f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.997f, 5.125f)
                arcToRelative(4f, 4f, 0f, false, true, 2.526f, 5.77f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18f)
                arcToRelative(4f, 4f, 0f, false, false, 2f, -7.464f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.967f, 17.483f)
                arcTo(4f, 4f, 0f, true, true, 12f, 18f)
                arcToRelative(4f, 4f, 0f, true, true, -7.967f, -.517f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                arcToRelative(4f, 4f, 0f, false, true, -2f, -7.464f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.003f, 5.125f)
                arcToRelative(4f, 4f, 0f, false, false, -2.526f, 5.77f)
            }
}

public val LucideIcons.All.BrainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brain: ImageVector
    @Composable get() = BrainDefinition.asImageVector()
