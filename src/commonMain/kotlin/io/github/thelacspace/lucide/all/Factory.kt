package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Factory") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8.5f)
                arcToRelative(.5f, .5f, 0f, false, false, -.769f, -.422f)
                lineToRelative(-4.462f, 2.844f)
                arcTo(.5f, .5f, 0f, false, true, 15f, 10.5f)
                verticalLineToRelative(-2f)
                arcToRelative(.5f, .5f, 0f, false, false, -.769f, -.422f)
                lineTo(9.77f, 10.922f)
                arcTo(.5f, .5f, 0f, false, true, 9f, 10.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 16f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.FactoryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Factory: ImageVector
    @Composable get() = FactoryDefinition.asImageVector()
