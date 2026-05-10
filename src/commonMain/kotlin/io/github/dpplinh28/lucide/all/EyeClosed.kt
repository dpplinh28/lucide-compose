package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 18f)
                lineToRelative(-.722f, -3.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                arcToRelative(10.645f, 10.645f, 0f, false, false, 20f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 15f)
                lineToRelative(-1.726f, -2.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 15f)
                lineToRelative(1.726f, -2.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 18f)
                lineToRelative(.722f, -3.25f)
            }
}

public val LucideIcons.All.EyeClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeClosed: ImageVector
    @Composable get() = EyeClosedDefinition.asImageVector()
