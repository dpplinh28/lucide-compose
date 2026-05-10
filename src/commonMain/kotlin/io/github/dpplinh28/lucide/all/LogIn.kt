package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LogIn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-4f)
            }
}

public val LucideIcons.All.LogInDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LogIn: ImageVector
    @Composable get() = LogInDefinition.asImageVector()
