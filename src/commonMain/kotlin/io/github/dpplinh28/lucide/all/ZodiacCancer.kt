package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacCancer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 14.5f)
                arcTo(9f, 6.5f, 0f, false, true, 5.5f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9.5f)
                arcTo(9f, 6.5f, 0f, false, true, 18.5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 14.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 9.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 7.0f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7.0f, 0f)
            }
}

public val LucideIcons.All.ZodiacCancerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacCancer: ImageVector
    @Composable get() = ZodiacCancerDefinition.asImageVector()
