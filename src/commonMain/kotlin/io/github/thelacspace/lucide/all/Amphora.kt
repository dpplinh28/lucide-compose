package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Amphora") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(5.632f)
                curveToRelative(0f, .424f, -.272f, .795f, -.653f, .982f)
                arcTo(6f, 6f, 0f, false, false, 6f, 14f)
                curveToRelative(.006f, 4f, 3f, 7f, 5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 5f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(.68f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5.632f)
                curveToRelative(0f, .424f, .272f, .795f, .652f, .982f)
                arcTo(6f, 6f, 0f, false, true, 18f, 14f)
                curveToRelative(0f, 4f, -3f, 7f, -5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 5f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineToRelative(-.68f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.AmphoraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Amphora: ImageVector
    @Composable get() = AmphoraDefinition.asImageVector()
