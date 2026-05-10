package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Refrigerator") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 7f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.RefrigeratorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Refrigerator: ImageVector
    @Composable get() = RefrigeratorDefinition.asImageVector()
